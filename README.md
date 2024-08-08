# My Notes on the tennis refactoring tasks

## Tennis Game 3

- Class fields
  - Rearranged declaration for p1 and p2 for consistency 
  - Rename for clarity (p1 --> p1score, p1N --> p1Name)
- Get score function
  - rename s to scoreOutput
- Won point function
  - Changed conditional to use Object.equals()