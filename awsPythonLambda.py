import json
import boto3
def lambda_handler(event, context):
    imagenes = ["perrito" , "leones", "orquesta" ,"rdmano" , "reto" ]
    client = boto3.client("rekognition")
    s3 = boto3.client("s3")
    print()
    for i in imagenes: 
        fileObj = s3.get_object(Bucket = "arepbucket" , Key= i+".jpg")
        file_content = fileObj["Body"].read()
        #response = client.detect_labels(Image = {"S3Object":{"Bucket": "arepbucket", "Name" : i+".jpg"}}, MaxLabels = 10 , MinConfidence=50 )
        response = client.detect_labels(Image = {"S3Object":{"Bucket": "arepbucket", "Name" : i+".jpg"}}, MaxLabels = 20  )
        print("foto = " , i )
        print("OBJETO RELACIONADO - %SIMULITUD")
        
        for j in response['Labels']: 
            print(j['Name']," - %", j['Confidence'] )
        print("\n")
        print("\n")
        
    #print(response)
    # TODO implement
    return {
        'statusCode': 200,
        'body': json.dumps('Hello from Lambda!')
    }
