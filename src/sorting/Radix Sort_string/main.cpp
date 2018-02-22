#include <iostream>
#include <stdlib.h>
#include <string>
#include<sstream>
#include<stdio.h>

int getmax(int [],int );
void countsort(int [],int ,int);
void radixsort(int [],int);
void print(int [],int);
int getnumber(std::string);

using namespace std;

// A utility function to get maximum value in a[]
int getmax(string a[],int n)
{
    string x=a[0];
    int max=x.length();

    for(int i=1;i<n;i++)
    {
        string s=a[i];
        if(s.length() > max)
            max=s.length();
    }

    return max;
}


void countsort(string a[],int n,int exp)
{
    string output[n];
    int i,count[424344]={0};

    //store count of occurrences in count[]

    for( i=0;i<n;i++)
    {
      string j=a[i];
      int q=getnumber(j);
      count[(q/exp)%100]++;
    }
    for(i=1;i<424344;i++)
      count[i]+=count[i-1];

    //build the output array
    for(i=n-1;i>=0;i--)
    {
        int q=getnumber(a[i]);
        output[count[(q/exp)%100] -1]=a[i];
        count[(q/exp)%100]--;
    }

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for(i=0;i<n;i++)
     a[i]=output[i];
}

void radixsort(string a[],int n)
{
    int m=getmax(a,n)*2;

    for(int exp=10;m*100000/exp>0;exp*=100)
        countsort(a,n,exp);
}

void print(string a[],int n)
{
    for(int i=0;i<n;i++)
        cout<<a[i] << " ";
    cout<< endl;
}

int main()
{
   string a[]={"COW","DOG","SEA","RUG","ROW","MOB","BOX","TAB","BAR","EAR","TAR","DIG","BIG","TEA","NOW","FOX","ABC","ADS"};
    int n=sizeof(a)/sizeof(a[0]);
    print(a,n);
    radixsort(a,n);
    print(a,n);
    return 0;
}


int getnumber(string a)
{
    int x=0;
    for(int i=0;i<a.length();i++)
    {
        x+=(a[i]-'0');
        x=x*100;
    }
    return x/100;
}
