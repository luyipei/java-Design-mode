public class Word implements WordDevice{
    private String words=new String("");
    public Word(String str){
        words=str;
    }

    @Override
    public String getString() {
        return this.words;
    }
    public void write(String color,int size)
    {
        System.out.println(size+"号"+color+"书写的"+this.words);
    }
}
