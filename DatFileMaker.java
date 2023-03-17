import java.io.FileWriter;
import java.io.IOException;

public class DatFileMaker {

	
	public static void main(String[] args) {
		
		// 입력할 문자열
		String fileName   = "out.dat"; // 파일이름
		String header = "START\r\n";
		String no = "000000"; 
		String name = String.format("%-10s", "하하하"); // 10자리로 맞추고 오른쪽 공백
		String tocken = String.format("%-50s","sfdjksfjlkjlkdjfj==="); // 50자리 오른쪽 공백
		String brnCd = String.format("%-6s","0073"); // 50자리 오른쪽 공백
		String tail = "\r\nTR";
		
		 try {
			 	// 파일 출력 스트림 객체 생성
			 	FileWriter fw = new FileWriter(fileName);
			 	
		 		fw.write(header);

				for(int i = 0; i < 10 ; i++) {
					fw.write(no);
					fw.write(name);
					fw.write(tocken);
					fw.write(brnCd);
				}
				
				fw.write(tail);
	            // 파일 출력 스트림 닫기
			 	fw.close();
	            
	            System.out.println("파일 쓰기 완료");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
