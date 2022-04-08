a = 1 + 2j
b = 3 + 4j

'''
Multiplication is performed like            (1 + 2j)(3 + 4j)
                                            = (1 * 3) + (1 * 4j) + (2j * 3) + (2j * 4j)
                                            = 3 + 4j + 6j + 8jsquare                            jsquare = -1
                                            = 3 + 10j -8
                                            = -5 + 10j
'''
print(a * b)


'''
Divison is performed like                   (1 + 2j)    (3 - 4j)    (Multiply and divide the equation by conjugate of denominator)
                                            -------- X  --------
                                            (3 + 4j)    (3 - 4j)

                                            
                                            Mutiply numerator with numerator that is (1 + 2j)(3 - 4j)      (steps of multiplication is shown above)
                                            Mutiply denominator with denominator that is (3 + 4j)(3 - 4j)  
                                            

                                            After multiplication we have


                                            3 - 4j + 6j - 8jsquare
                                            ----------------------
                                            9 - 12j + 12j - 16jsquare


                                            3 + 2j + 8
                                            ----------
                                              9 + 16

                                             11 + 2j
                                             -------     (divide by 25)
                                                25

                                            0.44 + 0.8j
'''
print(a / b)
