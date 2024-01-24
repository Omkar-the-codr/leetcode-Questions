Question 1: Return true if array is sorted or rotated sorted.

Solution: 

Compare all neignbour elements `(a,b)` in `A`,

the case of `a > b` can happen at most once.

Note that the first element and the last element are also connected.

If all `a <= b`, `A` is already sorted.

If all `a <= b` but only one `a > b`,

we can rotate and make `b` the first element.

Other case, return `false`.
First and last are connected and should be checked.
Eg. [2,1,3,4] (from the question)
Here, 'nums[i] <nums[i-1]' happens only once when i=1
1<2 (when i=1) so dropPoint=1.
But this doesn't mean that array is sorted and rotated. Basically-[1,3,4,2] is not sorted.
To handle this , first and last element are compared.
When droppoint =1 then the minimum value lies somewhere after index=0 so first element and last element are compared.
First element should be greater than or equal to lasat element then only they area sorted and rotated.

