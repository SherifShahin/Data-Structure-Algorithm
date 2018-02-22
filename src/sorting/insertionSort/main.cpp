#include <iostream>

using namespace std;

 main()
{
    int A[]={8,7,6,5,4,3,2,1};

    int size=8;
    cout<< "before sorting:"<< endl;

     for(int n=0;n<size;n++)
    {
        cout<< A[n]<< " ";
    }

    int key;
    int i;

    for(int j=1;j<size;j++)
    {
        key=A[j];
        i=j-1;

        while((i>=0) && (key<A[i]))
        {
            A[i+1]=A[i];
            i=i-1;
        }

        A[i+1]=key;
    }

    cout<<endl<<"after sorting :"<< endl;

    for(int n=0;n<size;n++)
    {
        cout<< A[n]<< " ";
    }

}
