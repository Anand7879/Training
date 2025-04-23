package class8;

public class class8 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 =  str+"";
        String str2 = str;
        System.out.println(str==str1); // It gives false because the for this new object is created in memory even str1 = str;
        System.out.println(str2 == str); // It gives true because in memory one space is created for both the string
        StringBuilder();
        FindFirstRepeat();
        FindMaxRepeat();

        
    }

    public static void FindFirstRepeat()
    {
        String str = "hhello";
        int n = str.length();
        char[] ch = new char[str.length()];
        for (int i = 0; i < n; i++) {
               ch[i]=str.charAt(i);
        }

        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(ch[i]==ch[j]) {
                    System.out.println("First letter which repeat = "+ch[i]);
                    return;
                }
            }
        }
    }
    
    public static  void FindMaxRepeat()
    {
        String str = "gfsdyyyyyyyyyy";
        int[] freq = new int[256]; // ASCII character set size
        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;

            if (freq[c] > maxCount) {
                maxCount = freq[c];
                maxChar = c;
            }
        }

        System.out.println("Maximum Repeated character is : "+maxChar+ " which is repeated "+ maxCount+" time.");
    }
    public static void StringBuilder()
    {
        StringBuilder str = new StringBuilder("hello");
        str.append(" Anand");
        // str.toString();


    }
}
