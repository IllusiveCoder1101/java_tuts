public class string_methods{
    public static void main(String[] args) {
        String name="Johnn";
        int length=name.length();
        char letter=name.charAt(2);
        int index=name.indexOf('n');
        int lastIndex=name.lastIndexOf('n');
        name=name.toUpperCase();
        name=name.toLowerCase();
        name=name.trim();
        name=name.replace('n','e');
        boolean isEmpty=name.isEmpty();

        boolean hasA=name.contains("a");
        boolean isEqual=name.equals("password");
        boolean isEqualsIgnoreCasing=name.equalsIgnoreCase("password");
        
        String subpart=name.substring(0,2);
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(subpart);
    }
}