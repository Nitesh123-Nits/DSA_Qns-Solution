class HelloWorld {
    public static void main(String[] args) {
        String s="abcaabcadef";
        String t="cad";
        int[] p=prefix(s);
        int i=0,j=0;
        int pos=-1;
        while(i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=p[j-1];
                }
                else{
                    i++;
                }
            }
            if(j==t.length()){
                pos=i-t.length();
                break;
            }
        }
        // for(i=0;i<p.length;i++)
        System.out.print(pos);
    }
    
    public static int[] prefix(String s){
            int[] p=new  int[s.length()];
        for(int i=1;i<s.length();i++){
            int j=p[i-1];
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=p[j-1];
            }
            if(s.charAt(i)==s.charAt(j)) j++;
           p[i]=j;
       
        }
        return p;
    }
}