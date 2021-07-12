// n /= 10 means n divided by 10 then make that value equal to n.

int n = ...;

int magic = 0;
while (n > 0) {
    n /= 10;
    magic++;
}
