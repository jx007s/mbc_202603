for i in range(1,21):
    one = i%10
    try:
        a = 1234/(one%3)
        print(i)
    except:
        try:
            a = 1234/one
            print("짝")
        except:
            print(i)