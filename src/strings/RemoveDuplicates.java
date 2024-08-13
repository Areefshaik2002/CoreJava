package strings;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        char[] chars = str.toCharArray();
        boolean[] visited = new boolean[256];
        
        for (char ch : chars) {
            if (!visited[ch]) {
                System.out.print(ch);
                visited[ch] = true;
            }
        }
    }
}
