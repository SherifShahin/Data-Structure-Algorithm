#include <iostream>
#define size 7
using namespace std;

 main()
{
    int A[]={8,7,6,5,4,3,2,1};

    cout<< "before sorting: "<<endl;

    for(int i=0;i<=size;i++)
    {
        cout<< A[i]<< " ";
    }

    int x=0;

    for(int i=0;i<=size;i++)
    {
        for(int j=0;j<size-i;j++)
        {
            if(A[j+1]<=A[j])
            {
                x=A[j+1];
                A[j+1]=A[j];
                A[j]=x;
            }
        }
    }

    cout<< endl;

    cout<< "after sorting:"<< endl;

    for(int i=0;i<=size;i++)
    {
        cout<< A[i]<< " ";
    }


}
