#include <iostream>

void counting_sort(int [],int [],int);

using namespace std;

int main()
{
    int a[12]={0,6 ,0 ,2 ,0 ,1 ,3 ,4 ,6 ,1 ,3 ,2 };
    int b[12];

    counting_sort(a,b,6);

    for(int i=1;i<=11;i++)
        cout<<b[i]<<" ";

    return 0;
}


void counting_sort(int a[],int b[],int k)
{
    int c[k+1];

    for(int i=0;i<k+1;i++)
    {
        c[i]=0;
    }

    for(int j=1;j<12;j++)
    {
         c[a[j]]=c[a[j]]+1;
    }


    for(int i=1;i<=k;i++)
    {
        c[i]=c[i]+c[i-1];
    }

    for(int j=11;j>=1;j--)
    {
        b[c[a[j]]]=a[j];
        c[a[j]]=c[a[j]]-1;
    }
}
