package encryptdecrypt;


import encryptdecrypt.algoritm.MainAlgoritmh;

public class Main {
    public static void main(String[] args) {
        MainAlgoritmh mainAlgoritmh = new MainAlgoritmh();
        String mode = "enc";
        int key = 0;
        String data = "";
        String inFile = "";
        String  outFile = "";
        

        for (int i =0;i<args.length-1;i++){
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                case "-in":
                    inFile = args[i+1];
                    break;
                case "-out":
                    outFile = args[i+1];
            }
        }


        MainAlgoritmh de = new MainAlgoritmh();
        if (inFile.equals("")& outFile.equals(""))
            de.encryptOrDecrypt(mode,data,key);
        else de.encryptOrDecrypt(mode,key,inFile,outFile);

        
        
        
        
        
      



    }
    }



