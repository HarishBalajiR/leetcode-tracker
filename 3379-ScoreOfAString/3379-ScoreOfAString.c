// Last updated: 2/22/2026, 1:54:40 PM
int scoreOfString(char* s) {
    int score = 0;
    for(int i = 0 ; *(s+1)!='\0' ; i++)
    {
        score+=abs(*s - *(s+1));
        s++;
    }
    return score;
}