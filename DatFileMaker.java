import java.io.FileWriter;
import java.io.IOException;

public class DatFileMaker {

	
	public static void main(String[] args) {
		
		// �Է��� ���ڿ�
		String fileName   = "out.dat"; // �����̸�
		String header = "START\r\n";
		String no = "000000"; 
		String name = String.format("%-10s", "������"); // 10�ڸ��� ���߰� ������ ����
		String tocken = String.format("%-50s","sfdjksfjlkjlkdjfj==="); // 50�ڸ� ������ ����
		String brnCd = String.format("%-6s","0073"); // 50�ڸ� ������ ����
		String tail = "\r\nTR";
		
		 try {
			 	// ���� ��� ��Ʈ�� ��ü ����
			 	FileWriter fw = new FileWriter(fileName);
			 	
		 		fw.write(header);

				for(int i = 0; i < 10 ; i++) {
					fw.write(no);
					fw.write(name);
					fw.write(tocken);
					fw.write(brnCd);
				}
				
				fw.write(tail);
	            // ���� ��� ��Ʈ�� �ݱ�
			 	fw.close();
	            
	            System.out.println("���� ���� �Ϸ�");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
