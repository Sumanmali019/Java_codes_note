class Solution {
  List<List<int>> generate(int num) {
    List<List<int>> ans = [];
    if (num == 0) {
      return ans;
    }
    ans.add([1]);
    for (
      int i = 1; i < num; i++) {
      List<int> row = List.filled(i + 1, 1);
      List<int> column = ans[i - 1];
      for (int j = 1; j < i; j++) {
        row[j] = column[j - 1] + column[j];
      }
      ans.add(row);
    }
    return ans;
  }
}

void main() {
  Solution solution = Solution();

  int num = 5;

  List<List<int>> ans = solution.generate(num);
  for (List<int> row in ans) {
    print(row);
  }
}
