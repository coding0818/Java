package ch15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/18
 * 이름 : 박가영
 * 내용 : P657
 */
public class P657 {
	public static void main(String[] args) throws IOException{
		DataInputStream in = null;
		DataOutputStream out = null;
		try {
			out = new DataOutputStream(new FileOutputStream("data.bin"));
			out.writeInt(123);
			out.writeFloat(123.456F);
			out.close();
			
			in = new DataInputStream(new FileInputStream("data.bin"));
			int aint = in.readInt();
			float afloat = in.readFloat();
			System.out.println(aint);
			System.out.println(afloat);
		}finally {
			if(in != null) {in.close();}
			if(out != null) {out.close();}
		}
	}

}
