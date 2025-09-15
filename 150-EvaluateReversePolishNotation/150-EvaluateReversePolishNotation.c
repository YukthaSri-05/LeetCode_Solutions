// Last updated: 9/15/2025, 8:40:00 PM
int evalRPN(char** tokens, int tokensSize) {
   int top=-1;
   int st[10001];
   for(int i=0;i<tokensSize;i++)
   {
    char ch=tokens[i][0];
    int size=strlen(tokens[i]);
    if (size==1&&(ch=='+' || ch=='-' || ch=='*' || ch=='/'))
    {
        int op2=st[top--];
        int op1=st[top--];
        int res;
        if(ch=='+') res=op1+op2;
        else if(ch=='-') res=op1-op2;
        else if(ch=='*')res=op1*op2;
        else if(ch=='/') res=op1/op2;
        st[++top]=res;
    }
    else
    {
        st[++top]=atoi(tokens[i]);
    }
   }
   return st[top];
}