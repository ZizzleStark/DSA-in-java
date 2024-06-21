

    class SecondMax {
        int print2largest(int arr[], int n) {
            int max=Integer.MIN_VALUE;
            int secmax=Integer.MIN_VALUE;
            int  maxindex=0;
            boolean allsame =true;
            if(n==0 || n==1)
                return -1;
            for(int i=0;i<n;i++){
                if(arr[i]!=max)
                {allsame =false;}
                if(arr[i]>max)
                {secmax=max;
                    max=arr[i];}
                else if(arr[i]>secmax && arr[i] != max)
                { secmax=arr[i];}

                if(allsame)
                { return -1;
                }


            }
            if(secmax==Integer.MIN_VALUE)
                return -1;
            return secmax;

            // test cases
            // if max was first element
            //if all elemnts are same
            // if there does not exist any max or secmax
        }
    }

