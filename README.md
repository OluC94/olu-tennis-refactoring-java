# My Notes on the tennis refactoring tasks

## Tennis Game 3

- Class fields
  - Rearranged declaration for p1 and p2 for consistency 
  - Rename for clarity (p1 --> p1score, p1N --> p1Name)
  - made name variables final because they do not change
- Get score function
  - extract the function that determines the score output while the game is active
  - Rearrange the function so that the if conditions are no longer nested
- Won point function
  - Changed conditional to use Object.equals()
  - removed unnecessary "this" keyword