#include <iostream>

int Partition(int [],int,int);
void quick_sort(int [],int,int);

using namespace std;

int n;
 main()
{
    cin >> n;

    int a[n];

    for(int i=0;i<n;i++)
    {

        cin>> a[i];
    }

    quick_sort(a,0,n-1);

    for(int i=0;i<n;i++)
    {

        cout<< a[i] <<" ";
    }


}

int Partition(int a[],int p,int r)
{
    int x,temp,i;
    x=a[r];
    i=p-1;

    for(int j=p;j<=r-1;j++)
    {
      if(a[j] <= x)
      {
          i++;

          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
      }
    }

    temp=a[i+1];
    a[i+1]=a[r];
    a[r]=temp;

    return i+1;

}

void quick_sort(int a[],int p,int r)
{
    int q;

    if(p<r)
    {
        q=Partition(a,p,r);
        quick_sort(a,p,q-1);
        quick_sort(a,q+1,r);
    }

}
