# CAI(Color Artificial Intelligence)

## [ About CAI Project ]
`CAI`는 사용자가 업로드한 사진을 딥러닝 모델을 적용하여 퍼스널컬러 타입을 진단하고, 이를 기반으로 퍼스널컬러 팔레트와 패션 아이템을 추천합니다.   
기존에 사람의 눈에 의해 판단되었던 주관적인 퍼스널 컬러 타입의 진단 과정을 사용자에게 제공받은 사진을 화이트 밸런스 조정 등 전처리를 거쳐 얻은 측색 결과로 사용자의 퍼스널 컬러 타입을 진단합니다.   
   
`Personal Color`는 개인 고유의 신체색을 의미하며, 개인의 특성을 분석하여 퍼스널컬러 타입 분류체계의 한 타입에 개인을 대응시켜 그에 조화를 이루는 색을 진단하여 적합한 메이크업, 헤어, 의상 등의 `색채 이미지를 연출`하는 시스템입니다.   
   
#### `CAI Total Process`   
<img src="jay/img/total-process.jpg" width=100%>   
   
## [ Deep Learning_Personal Color Type Classifier ]

### Dataset Creater
#### `Face Detection`   
: 얼굴인식, 이미지 리사이징 (input image 사진 20만장 / output image 사진 15만장)   
<img src="jay/img/face-detection.jpg" width=100%>   
#### `Skin Color Extraction`   
: 안면 측색   
[Personal color analysis report](url)   
<img src="jay/img/skin-color-extraction.jpg" width=100%>   
#### `Color System Converter & Type Classifier`   
: 색 체계 변환 [ BGR → RGB → HSV ]   
: 측색 결과 기준 딥러닝용 데이터셋 생성   
[Personal color theory report](url)   
<img src="jay/img/color-system-converter.jpg" width=100%>   
   
### Model
#### `CNN / AlexNet`   
: Result model - `CAI.h5`
<img src="jay/img/cnn-alexnet.jpg" width=100%>   
   
   
## [ Color Palette Extraction ]

### Bright Color & Harmony Color
#### `Personal color Analysis`   
: 퍼스널컬러 분석 확장 프로세스   
[Personal color analysis report](url)   
<img src="jay/img/Data-Analysis.jpg" width=100%>   
색이론으로 나오는 팔레트는 원래 하난데욤 의문점이 있어서 아래처럼 분석 ㅇㅇ   
그래서 최종 팔레트는 [edgwsrfafhnwdrs] 입니다   
   
   
### Main Purchase Clustering Color
#### `Data acquisition & Representation User's color`   
<img src="jay/img/color-clustering.jpg" width=100%>   
데이터베이스의 상품 이미지를 경계값 기반의 패션아이템 분리 모델을 사용하여 배경 이미지와 옷을 분리, 대표 색을 추출하여 데이터베이스에 해당 상품의 HSV data로 적재합니다.   
사용자가 닉네임으로 조회할 경우 데이터베이스에서 사용자의 구매상품을 실시간으로 조회하여 구매한 상품의 색 리스트를 받아옵니다.   
   
`Gray tone Filter`를 이용하여 사용자가 구매한 상품 중에서 흑백에 근접한 상품을 제외시킨 후 `Color Generator`로 클러스터링의 오차를 줄위기 위해 구매상품 색상의 규모를 확장합니다.   
   
위 결과값으로 `Color Clustering`에서 고객이 주로 구매한 상품의 색을 군집화하여 주요 구매 색상 팔레트를 추출합니다.   
   
   
## [ Webstie ]
<img src="jay/img/cai-webpage.jpg" width=100%>   

### Type Prediction & Matched Palette
`Personal Color Type Prediction`는 웹을 통해 사용자가 업로드한 사진을 딥러닝 모델`cai.h5`를 적용하여 퍼스널컬러 타입을 예측해 사용자에게 안내합니다.   
   
`Recommendation Bright&Harmony Color`는 예측한 퍼스널컬러 타입 결과와 `Skin Color Extraction`로 추출한 사용자의 얼굴색에 맞는 Bright Color Palette와 Harmony Color Palette를 추천합니다.   

### Fashion Recommendation
`Palette Color Matched Product`에서 최종적으로 추출된 3가지 Color Palette에 해당하는 상품을 데이터베이스에서 실시간으로 조회, 추천하여 사용자별 개인화 서비스를 제공합니다.