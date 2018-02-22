#include <iostream>

int getmax(int [],int );
void countsort(int [],int ,int);
void radixsort(int [],int);
void print(int [],int);
using namespace std;

// A utility function to get maximum value in a[]
int getmax(int a[],int n)
{
    int max=a[0];
    for(int i=1;i<n;i++)
    {
        if(a[i] > max)
            max=a[i];
    }

    return max;
}


void countsort(int a[],int n,int exp)
{
    int output[n];
    int i,count[10]={0};

    //store count of occurrences in count[]

    for( i=0;i<n;i++)
      count[(a[i]/exp)%10]++;

    for(i=1;i<10;i++)
      count[i]+=count[i-1];

    //build the output array
    for(i=n-1;i>=0;i--)
    {
        output[count[(a[i]/exp)%10] -1]=a[i];
        count[(a[i]/exp)%10]--;
    }

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for(i=0;i<n;i++)
     a[i]=output[i];
}

void radixsort(int a[],int n)
{
    int m=getmax(a,n);

    for(int exp=1;m/exp>0;exp*=10)
        countsort(a,n,exp);
}

void print(int a[],int n)
{
    for(int i=0;i<n;i++)
        cout<<a[i] << " ";
    cout<< endl;
}

int main()
{
    int a[]={170,45,90,802,24,2,66};
    int n=sizeof(a)/sizeof(a[0]);
    print(a,n);
    radixsort(a,n);
    print(a,n);
    return 0;
}
