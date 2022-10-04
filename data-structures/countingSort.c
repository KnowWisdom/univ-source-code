#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>

void printArray(int[], int);
void selectionSort(int[], int);
void countingSort(int[], int);

int main(){
    int a[100];
    int i;

    srand(time(NULL));

    for(i = 0 ; i < 100 ; i++){
        a[i] = rand() % 101;    
    } // 랜덤 할당


    printf("=======================================\n\n");
    printf("[ 랜덤 생성한 초기 배열 A ]\n");
    printArray(a, 100);
    printf("\n");printf("\n");

    countingSort(a, 100); 
    selectionSort(a, 100);

    return 0;
}

//* 배열 출력 함수
void printArray(int a[], int length){ 
    int i;

    for(i = 0 ; i < length ; i++){
        if(i % 10 == 0) printf("\n");
        printf("%3d ", a[i]);
    }
}


void countingSort(int arr[], int length){
    int i;
    int row_terms[101]={0,}, starting_pos[101]={0,} , sorted[100]= {0,};

    starting_pos[0] = 0; // 시작은 무조건 인덱스 0

    for(i = 0 ; i < 100 ; i++){
        row_terms[arr[i]]++; 
    } // row_terms 계산

    for(i = 1 ; i < 101 ; i++){
        starting_pos[i] = starting_pos[i-1] + row_terms[i-1];
    } // starting_pos 계산

    for(i = 0 ; i<100 ; i++){
        sorted[starting_pos[arr[i]]++] = arr[i];
    } // 정렬된 결과 집어넣기

    printf("=======================================\n\n");
    printf("[ Counting Sort 결과 ]\n\n");
    
    printf("1. 배열 row_terms \n");
    printArray(row_terms, 101);
    printf("\n");printf("\n");printf("\n");

    printf("2. 배열 starting_pos \n");
    printArray(starting_pos, 101);
    printf("\n");printf("\n");printf("\n");
    
    printf("3. counting sort로 정렬한 배열 sorted \n");
    printArray(sorted, 100);
    printf("\n");printf("\n");printf("\n");printf("\n");
}

void selectionSort(int arr[], int length){
    int i,j,temp;

    for( i = 0 ; i<length-1 ; i++){
        for(j=i+1; j<length ; j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    printf("=======================================\n\n");
    printf("[ Selection Sort 결과 ]\n");
    printArray(arr, 100);
    printf("\n");printf("\n");
}   