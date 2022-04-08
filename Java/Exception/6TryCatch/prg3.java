import java.io.*;

class Demo {
	
	public static void main(String[] args) {
		
		//compiler does not know, whether these exceptions are gonna occur.
		//As they are unchecked, hence there is no error
		try {

		}catch(ArithmeticException e) {

		}catch(RuntimeException e) {

		}catch(OutOfMemoryError e) {

		}catch(Error e) {

		}
		
		//the 'Exception' and 'Throwable' can be used to write generic solution for unnchecked  exception as well.
		//and compiler does not know whether unchecked exceptions will occur. So it still does not gives errors for those 
		try {

		}catch(Exception e) {

		}catch(Throwable e) {

		}

		//But oh boy, our compiler is quite smart to figure out that these specific exceptions will never be thrown, thus we got error
		try {

		}catch(EOFException e) {

		}catch(FileNotFoundException e) {

		}catch(IOException e) {

		}catch(InterruptedException e) {

		}
	}
}
