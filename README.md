# My Notes on the tennis refactoring tasks

## Tennis Game 3

- Class fields
  - Rearranged declaration for p1 and p2 for consistency 
  - Rename for clarity (p1 --> p1score, p1N --> p1Name)
  - made name variables final because they do not change
- getScore function
  - extract the function that determines the score output while the game is active
  - Rearrange the function so that the if conditions are no longer nested
- wonPoint function
  - Changed conditional to use Object.equals()
  - removed unnecessary "this" keyword

## Tennis Game 6

- getScore function
  - add override label
  - change var keyword to String
  - Extract the duplicated switch statements to their own function
  - Got rid of redundant variables and return directly from the condition blocks
  - Extract the end game if-else block to its own function

## Tennis Game 1

- got rid of hard-coded player names
- made player name variables final
- fixed the poor formatting and indentation
- renamed the scoring variables from m_score1 to player1Score
- wonPoint function
  - use playerName.equals()
- getScore function
  - extract switch statement for draws into its own function