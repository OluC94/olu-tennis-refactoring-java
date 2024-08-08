# My Notes on the tennis refactoring tasks

## Tennis Game 3
For the class fields I rearranged the declaration for p1 and p2 for consistency. For clarity, I 
renamed the score variables (e.g. p1 --> p1score, p1N --> p1Name) and made the player name variables final because they do not change.
For the getScore function I extracted the function that determines the score output while the game is not deuce.
I also extracted out boolean statements so that the if conditions are no longer nested.
For the wonPoint function I changed conditional to use Object.equals() and removed the unnecessary "this" keyword on the score variables

## Tennis Game 6

For the getScore function I added the @Override label for consistency with the wonPoint function. 
I changed the var keyword to String so that is more specific. I extracted the duplicated switch statements to one dynamic function to
reduce repetition. I tried the same with the end game if-else block but 
struggled with the syntax for the (>=2) case, so I kept the original code but moved it into a separate function. 
I also got rid of the redundant variables and instead returned the strings directly from the condition blocks.


## Tennis Game 1

I got rid of the hard-coded player names, made the player name variables final and renamed the scoring variables from m_score1 to player1Score. I also fixed the poor formatting and indentation.
I extracted the switch statement that determines the output for draws from the getScore function, but didn't get round to further refactoring of this function