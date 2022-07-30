public class EncryptFacade {
    private FileReader reader;
    private  FileWriter writer;
    private  CipherMachine cipher;

    public EncryptFacade() {
        reader=new FileReader();
        writer=new FileWriter();
        cipher=new CipherMachine();
    }
    public void fileEncrypt(String filename){
        reader.readFlie(filename);
        writer.writeFile();
        cipher.cipherFile();

    }
}
