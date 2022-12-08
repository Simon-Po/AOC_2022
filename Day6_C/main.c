#include "stdio.h"
#include "stdlib.h"
#include "string.h"



int main(int argc, char const *argv[])
{
    FILE* file;
    char ch;
    char chArr[4];
    u_int32_t count;

    file = fopen("input.txt", "r");
    if (NULL == file) {
        printf("file can not be opened");
        return -1;
    }
    

    do {
        
        for (size_t i = 0; i < 4; i++)
        {
        
        ch = fgetc(file);
        
        printf("%c", ch);
        chArr[0] = chArr[1];
        chArr[1] = chArr[2];    
        chArr[2] = chArr[3];
        chArr[3] = ch;
            
        }



        if(chArr[0] == ch || chArr[1] == ch || chArr[2] == ch|| chArr[3] == ch){
            /*printf("found nothing");*/
            count ++;
        }else {
           /* printf("found something");*/
            fclose(file);
            return 0;
        }


    } while (ch != EOF);

   fclose(file);


    
    return 0;
}
