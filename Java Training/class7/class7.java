package class7;

public class class7 {
    public static void main(String args[]){
        // int sum = 123;
        // Sum of digits...
        // int s = 0;
        // while(sum != 0){
        //     s += (sum % 10);
        //     sum /= 10;
        // }
        // System.out.println(s);
        
        // Digits by even and odd...
        // while(sum != 0){
        //     int temp = sum % 10;
        //     if(temp % 2 == 0){
        //         System.out.println(temp+" is even");
        //     }
        //     else{
        //         System.out.println(temp+" is odd");
        //     }
        //     sum /= 10;
        // }

        // Prime numbers...
        // int arr[] = {1,2,3,4,5,6,67,57,89};
        // System.out.println("Prime numbers:");
        // for(int i=0; i<arr.length; i++){
        //     boolean isPrime = true;
        //     for(int j=2; j<=arr[i]/2; j++){
        //         if(arr[i]%j==0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if(isPrime){
        //         System.out.println(arr[i]);
        //     }
        // }

        // String 
        // String str = "Hello";
        // for(int i=0; i<str.length(); i++){
        //     System.out.print(str.charAt(i));
        // }

        // Print matching characters...
        // String str = "Helloi";
        // String str1 = "Hiiii";
        // for(int i=0; i<str.length(); i++){
        //     for(int j=0; j<str1.length(); j++){
        //         if(str.charAt(i) == str1.charAt(j)){
        //             System.out.println(str.charAt(i));
        //             break;
        //         }
        //     }
        // }

        // Palindrome or not...
        // String str = "racecar";
        // int l = 0, r = str.length() - 1;
        // boolean isPalindrome = true;
        // while(l < r){
        //     if(str.charAt(l) != str.charAt(r)){
        //         isPalindrome = false;
        //         break;
        //     }
        //     l++;
        //     r--;
        // }
        // if(isPalindrome){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not a Palindrome");
        // }

        // Convert string to char array...
        // String str = "racecar";
        // char arr[] = str.toCharArray();
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]);
        // }
        // System.out.println();
        // Count given charcter frequency...
        // String target = "r";
        // int count = 0;
        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i) == target.charAt(0)){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // String str= "hello";
        // str = "word";
        // System.out.println(str);
        
        // Vowel and consonant count...
        String str = "racecarjdhfgdg&&&*";
        int vowelCount = 0;
        int consonantCount = 0;
        // char arr[] = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)){
                switch(str.charAt(i)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        vowelCount++;
                    default: 
                        consonantCount++;
                }
            }
        }
        System.out.println("Vowel: "+vowelCount);
        System.out.println("Consonant: "+consonantCount);

        // Remove duplicates...
        // String str = "racecarjdhfgdg";
        // char arr[] = str.toCharArray();
        // int n = str.length();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i] == arr[j]){
        //             for(int k=j; k<n-1; k++){
        //                 arr[k] = arr[k+1];
        //             }
        //             n--;
        //         }
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]);
        // }
    }
}