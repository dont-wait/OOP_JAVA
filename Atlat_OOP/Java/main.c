#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	//index số đếm, chỉ số, thứ tự, phần tử
	
	//DYNAMIC ARRAY
	
	//float* arr = malloc(7 * 4);
	//float* arr = malloc(28);
	//float* arr = malloc(7 * sizeof(float));	//mảng 7 phần tử, 4 byte float mỗi phần tử
											//mảng gồm 7 biến float
	float* arr = calloc(7, sizeof(float));
	//biến ct		new
	//		ref		new Object()
	arr[0] = 39;
	arr[1] = 79;
	arr[2] = 6868;
	arr[3] = 2204;
	printf("The arr array has: \n");
	
	for(int i = 0; i < 7; i++)	
		printf("%.1f ", arr[i]);
	float vol[365];	//khai bảo kiểu này thì có rác cho những phần tử chưa đc nhập
	
	//side effect
	vol[0] = 50;
	printf("\nThe vol array has: \n");
	
	for(int i = 0; i < 365; i++)	
		printf("%.1f ", vol[i]);
		
	printf("\n\nThe v arry has: \n");	
	float v[365] = {0, 5, 10, 15};	//khai báo kiểu này thì C ngầm hiểu những phần tử này có value, phần còn lại thì = 0
	
	for(int i = 0; i < 365; i++)	//ko phải rác
		printf("%.1f ", v[i]);
	 
	 //MANG TĨNH, STATIC ARRAY, STACK LIFO, BỊ KIỂM SOÁT, BỊ ĐỘNG TRONG CẤP PHÁT XIN RAM
	return 0;
}