#include <stdio.h> 
#include <math.h>
#include <string.h>
int main(){
    int array[]={10,25,50,75,100}; //Each int is 4 bytes
    int length=sizeof(array);
    printf("%d\n",length); //This displays # of vars times bytes.
    length=sizeof(array)/sizeof(array[0]);
    printf("%d\n",length); //Now display actual size.
    char str1[200];
    printf("Enter a string:");
    scanf("%[^\n]",str1);
    printf("You entered: %s\n",str1);

    char str[100]="Chase DeBank";
    char usr[100];
    int bank=1111;
    int pin;
    int attempt=2;
    int i=0;
    int option;

    for(i; i<attempt-1; i++){
        printf("Enter your user ID: ");
        scanf("%[^\n]",usr);
        if (usr==str){
            printf("Enter your PIN: ");
            scanf("%d\n",&pin);
            if (pin==bank){
                printf("Welcome back, %s\n.",str);
                printf("1) View Balance\n\n");
                printf("2) Deposit Money\n\n");
                printf("3) Withdraw Money\n\n");
                printf("4) Log Out\n");
                printf("5) Exit system\n\n");
                printf("Please choose a numerical option:");
                scanf("%d\n",&option);
                if(option!=4 ){
                    printf("We're sorry, that option is temporarily unavailable. Please choose another option.");
                } else{
                    break;
                }
            }else{
                printf("Wrong PIN entered - Please try again.");
            }
        } else{
            printf("Wrong user ID - Please try again.");
        }
    }
    

 return 0;
}