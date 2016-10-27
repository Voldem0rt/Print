
public class PrinterDefault implements IPrinter {
	public PrinterDefault() {
		
	}
	
	public void printString(String str) {
		if(str instanceof String) {
			System.out.print(str);
		}
	}
}
