
import pyttsx3
import PyPDF2



    
book =open('India MAR-2020.pdf','rb')
pdfReader=PyPDF2.PdfFileReader(book)
pages=pdfReader.numPages
print(pages)
Speaker= pyttsx3.init()
Speaker.say("Helo Bharadwaj!")
page=pdfReader.getPage(0)
text=page.extractText()

Speaker.say("no of pages in this book are "+str(pages))


Speaker.runAndWait()
