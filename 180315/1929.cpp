#include <iostream>
#include <cmath>
using namespace std;

bool *array;
int M, N;

void solve(){
    int sqrtn = sqrt(N);
    for(int i=2; i<=sqrtn; i++){
        if(!array[i]) continue;
        for(int j=2*i; j<=N; j+=i){
            array[j] = false;
        }
    }
}

int main(){
    ios::sync_with_stdio(false);
    cin >> M >> N;

    array = new bool[N+1];


    fill_n(array, N+1, true);
    array[0] = false;
    array[1] = false;

    solve();

    for(int i=M; i<=N; i++){
        if(array[i]){
            cout << i << "\n";
        }
    }
}


