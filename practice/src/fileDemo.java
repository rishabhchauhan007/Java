import java.io.*;

public class fileDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File("cricket.txt") ;
//        System.out.println(f.exists());
//        f.createNewFile() ;
//        System.out.println(f.exists());
//        File f = new File("pinkFloyd") ;
//        f.mkdir() ;
//        File f1 = new File("pinkFloyd","abc.txt") ;
//        f1.createNewFile() ;
//        File f2 = new File("/home/bonami/IdeaProjects/practice/pinkFloyd","demo.txt") ;
//        f2.createNewFile() ;
//        long length = f2.length();
//        System.out.println(length);
//        String[] len = f2.list() ;
//        System.out.println(len);
//        int count = 0 ;
//        File f3 = new File("/home/bonami/IdeaProjects/practice/pinkFloyd") ;
//        String[] str = f3.list() ;
//        for( String s1 : str){
//            count++ ;
//            System.out.println( s1 );
//        }
//        System.out.println("total number:" + count);
//        FileWriter fw=new FileWriter("cricket.txt",true);
//        fw.write("fefuibvwi");
//        char[] c = {'r','c','a'} ;
//        fw.write(c);
//        fw.close();
//        FileReader f = new FileReader("cricket.txt") ;
//        int i = f.read() ;
//        while( i != -1 ){
//            System.out.print((char)i);
//            i = f.read() ;
//        }
//        File f=new File("cricket.txt");
//        FileReader fr=new FileReader(f);
//        char[] ch=new char[(int)f.length()]; //small
//
//        fr.read(ch);
//        for(char ch1:ch)
//        {
//            System.out.print(ch1);
//        }
//        FileWriter fw = new FileWriter("cricket.txt") ;
//        BufferedWriter bw = new BufferedWriter( fw ) ;
//        bw.write(100);
//        bw.newLine();
//        char[] ch = { 'a' , 'b' , 'c' , 'd' } ;
//        bw.write( ch );
//        bw.newLine();
//        bw.write("software solutions");
//        bw.flush();
//        bw.close();
//        FileReader fr=new FileReader("cricket.txt");
//        BufferedReader br=new BufferedReader(fr);
//        String line=br.readLine();
//        while(line!=null)
//        {
//            System.out.println(line);
//            line=br.readLine();
//        }
//        br.close();
        PrintWriter pr = new PrintWriter("file4.txt") ;
        BufferedReader br1 = new BufferedReader( new FileReader("file3.txt")) ;
        BufferedReader br2 = new BufferedReader( new FileReader("cricket.txt")) ;
        String line1 = br1.readLine() ;
        String line2 = br2.readLine() ;
        while( line1 != null || line2 != null ){
            if( line1 != null ){
                pr.println(line1);
                line1 = br1.readLine() ;
            }
            if( line2 != null ){
                pr.println(line2);
                line2 = br2.readLine() ;
            }
        }
        pr.flush();
        br1.close();
        br2.close();
        pr.close();

    }

}

