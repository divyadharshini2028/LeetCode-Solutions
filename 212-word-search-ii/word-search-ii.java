class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = new TrieNode();

        // Store all words in Trie
        for (String word : words) {
            TrieNode curr = root;

            for (char c : word.toCharArray()) {
                int index = c - 'a';

                if (curr.children[index] == null) {
                    curr.children[index] = new TrieNode();
                }

                curr = curr.children[index];
            }

            curr.word = word;
        }

        List<String> ans = new ArrayList<>();

        // Start DFS from every cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, ans);
            }
        }

        return ans;
    }

    void dfs(char[][] board, int row, int col,
             TrieNode node, List<String> ans) {

        // Outside the board
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return;
        }

        char c = board[row][col];

        // Already visited OR character not present in Trie
        if (c == '#' || node.children[c - 'a'] == null) {
            return;
        }

        TrieNode next = node.children[c - 'a'];

        // Complete word found
        if (next.word != null) {
            ans.add(next.word);
            next.word = null;
        }

        // Mark current cell as visited
        board[row][col] = '#';

        // Down
        dfs(board, row + 1, col, next, ans);

        // Up
        dfs(board, row - 1, col, next, ans);

        // Right
        dfs(board, row, col + 1, next, ans);

        // Left
        dfs(board, row, col - 1, next, ans);

        // Restore original character
        board[row][col] = c;
    }
}