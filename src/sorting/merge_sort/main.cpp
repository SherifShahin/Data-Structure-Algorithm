#include <iostream>
#include<limits>
#include<stdio.h>
#include<cmath>
void merge_sort(int [],int ,int);
void MERGE(int [],int,int,int);

using namespace std;

void MERGE(int a[],int p,int q,int r)
{
   int n1=q-p+1;
   int n2=r-q;

    int l[n1+1];
    int R[n2+1];

    int i,j;

    for(i=0;i<n1+1;i++)
        l[i]=a[p+i-1];

     for(j=0;j<n2+1;j++)
        R[j]=a[q+j];

    l[n1+1]= INFINITY;
    R[n2+1]= INFINITY;

    i=1;
    j=1;

    for(int k=p;k<=r;k++)
    {
        if(l[i] <= R[j])
        {
            a[k]=l[i];
            i=i+1;
        }
        else
        {
            a[k]=R[j];
            j=j+1;
        }
}
}


void merge_sort(int a[],int p,int r)
{
    int q;

    if(p<r)
    {
        q=p+(r-p)/2;
        merge_sort(a,p,q);
        merge_sort(a,q+1,r);
        MERGE(a,p,q,r);
    }
}


int main()
{

    int a[8]={8,7,6,5,4,3,2,1};


    for(int i=0;i<8;i++)
    {
        cout<<a[i]<< " ";
    }

    int p=0;
    int r=7;

    merge_sort(a,p,r);

    cout<<endl;

    for(int i=0;i<8;i++)
    {
        cout<<a[i]<< " ";
    }

    return 0;
}
