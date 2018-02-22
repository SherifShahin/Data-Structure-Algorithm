#include <iostream>

using namespace std;

main()
{
    int A[]={8,7,6,5,4,3,2,1};

    int size=8;

    int i,key;

    int j=0;
    int x=0;

    cout<< "before sorting :"<< endl;
     for(int m=0;m<size;m++)
    {
        cout<< A[m]<< " ";
    }

    for(int n=0;n<size;n++)
    {
        key=n;
        for(i=n;i<size;i++)
        {
             j=i+1;

            if(j>=size)
                break;

            if(A[i]<A[j] && A[i] < A[key])
                key=i;
            if(A[j]<A[i] && A[j] < A[key])
                key=j;
        }
        x=A[n];
        A[n]=A[key];
        A[key]=x;
    }

    cout<< endl;
    cout<< "after sorting :"<< endl;

    for(int m=0;m<size;m++)
    {
        cout<< A[m]<< " ";
    }
}
