class Caesar {
    String caesar(String s, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == ' ') {
                result.append(' ');
                continue;
            }

            if(temp >= 'a' && temp <='z') {
                temp += n;
                while(!(temp >= 'a' && temp <= 'z'))
                    temp -= 26;
            } else {
                temp += n;
                while(!(temp >= 'A' && temp <= 'Z'))
                    temp -= 26;
            }
            result.append(temp);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
    }
}