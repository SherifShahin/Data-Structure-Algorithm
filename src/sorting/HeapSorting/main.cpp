#include <iostream>

void build_max_heap(int [],int);
void max_heapify(int [],int,int);
void heap_sort(int [],int);

using namespace std;

static int size;

 main()
{
    cout<< "size =";
    cin >> size;

    int a[size];
    a[0]=size;
    cout<< endl<<"enter your elements for sorting: ";

    for(int i=1;i<=size;i++)
    {
        cin>> a[i];
    }

    int heapsize=size;
    heap_sort(a,heapsize);

    cout<< endl << "after Heap sorting:"<< endl;

    for(int i=1;i<=size;i++)
    {

        cout<< a[i]<< " ";
    }

}

void max_heapify(int a[],int i,int heapsize)
{
    int l,r,x,largest;

    l=2*i;
    r=2*i+1;

    if(l<= heapsize && a[l]> a[i])
    largest=l;
    else
        largest=i;

    if(r<= heapsize && a[r]> a[largest])
        largest=r;

    if(largest != i)
    {
        x=a[i];
        a[i]=a[largest];
        a[largest]=x;
        max_heapify(a,largest,heapsize);
    }
}

void build_max_heap(int a[],int heapsize)
{
    for(int i=heapsize/2;i>=1;i--)
    {
        max_heapify(a,i,heapsize);
    }
}


void heap_sort(int a[],int heapsize)
{
    build_max_heap(a,heapsize);
    int x;
    for(int i=heapsize;i>=2;i--)
    {
        x=a[i];
        a[i]=a[1];
        a[1]=x;
        max_heapify(a,1,i-1);
    }
}

