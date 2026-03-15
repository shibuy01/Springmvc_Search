package springmvc.serch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;

@Controller
public class FileUploadController {

	@RequestMapping("/upload")
	public String upload() {
		return "Fileform";
	}
	
	@PostMapping("/uploadimage")
	public String fileupload(@RequestParam("profile") MultipartFile file, HttpSession s, Model m) throws IOException {
		
		System.out.println("file uploades handler");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		
		byte[] data = file.getBytes();
		
		String path = s.getServletContext().getRealPath("/") + "WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded ");
			
			m.addAttribute("msg", "uploaded successfully");
			m.addAttribute("filename", file.getOriginalFilename());
			
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("file uploaded error");
			
			m.addAttribute("msg", "uploaded error");
		}
		return "successFile";
	}
}
