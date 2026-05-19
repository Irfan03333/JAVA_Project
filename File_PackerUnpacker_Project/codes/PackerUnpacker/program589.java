import java.io.*;
import java.util.*;

class program589
{
    public static void main(String A[])     throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[1024];
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the name of folder :");
        String FolderName = sobj.nextLine();

        System.out.println("Enter the  name of th packed file :");
        String Packname = sobj.nextLine();
        

        File fobj = new File(FolderName);

       

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File Packobj = new File(Packname);
            Packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(Packobj);

            FileInputStream fiobj = null;

            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in the folder are :"+fArr.length);

            for(int i = 0; i< fArr.length; i++)
            {
                fiobj = new  FileInputStream(fArr[i]);

                System.out.println("File name :"+fArr[i].getName()+"File size"+fArr[i].length()+"bytes");

                if(fArr[i].igetName().endsWith(".txt"))
                {
                    while(iRet = fiobj.read(Buffer) != -1)
                    {
                        
                    }
              
                }
              
                                
            }
            
        }
        else
        {
            System.out.println("There is no such folder");
        }

    }
}






