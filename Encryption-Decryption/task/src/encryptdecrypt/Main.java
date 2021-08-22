package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        EncryptionCore encryptionCore = new EncryptionCore();

        String mode = "enc";
        int key = 0;
        String data = null;
        String inFile = "";
        String  outFile = "";
        String algorithmName = null;
        

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
                    break;
                case "-alg":
                    algorithmName = args[i+1];
                    break;
            }
        }
        encryptionCore.encryptOrDecrypt(data,algorithmName,mode,key,inFile,outFile);

        
      



    }
    }



