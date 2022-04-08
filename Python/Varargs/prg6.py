def fun(* args):

    for i in args:
        print(i,type(i),sep="  is  ")

ls = ["India","Pakistan","Canada"]
st = {"India","Pakistan","Canada"}
tp = ("India","Pakistan","Canada")
dic = {1:"India",2:"Pakitsan"}
fun(ls,st,tp,dic)
