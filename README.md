# CAI(Color Artificial Intelligence)

## [ About CAI Project ]
`CAI`�� ����ڰ� ���ε��� ������ ������ ���� �����Ͽ� �۽����÷� Ÿ���� �����ϰ�, �̸� ������� �۽����÷� �ȷ�Ʈ�� �м� �������� ��õ�մϴ�.   
������ ����� ���� ���� �ǴܵǾ��� �ְ����� �۽��� �÷� Ÿ���� ���� ������ ����ڿ��� �������� ������ ȭ��Ʈ �뷱�� ���� �� ��ó���� ���� ���� ���� ����� ������� �۽��� �÷� Ÿ���� �����մϴ�.   
   
`Personal Color`�� ���� ������ ��ü���� �ǹ��ϸ�, ������ Ư���� �м��Ͽ� �۽����÷� Ÿ�� �з�ü���� �� Ÿ�Կ� ������ �������� �׿� ��ȭ�� �̷�� ���� �����Ͽ� ������ ����ũ��, ���, �ǻ� ���� `��ä �̹����� ����`�ϴ� �ý����Դϴ�.   
`CAI Total Process`   
<img src="jay/img/total-process.jpg" width=100%>   
   
## [ Deep Learning_Personal Color Type Classifier ]

### Dataset Creater
`Face Detection` : ���ν�, �̹��� ������¡ (input image ���� 20���� / output image ���� 15����)   
<img src="jay/img/face-detection.jpg" width=100%>   
`Skin Color Extraction` : �ȸ� ����   
    [* ���� ���� ����](url)   
<img src="jay/img/skin-color-extraction.jpg" width=100%>   
`Color System Converter` : ���� ��� ���� Ÿ�� �з�   
	- BGR �� RGB �� HSV   
`Personal Color Type Classifier` : �����׿� �����ͼ� ����   
    [* �� �м� ����](url)   
<img src="jay/img/color-system-converter.jpg" width=100%>   
   
### Model
	[ ���μ��� �̹��� ]   
`CNN Training`   
Result Model : `cai.h5`   
   
   
## [ Color Palette Extraction ]

### Bright Color & Harmony Color
<img src="jay/img/Data-Analysis.png" width=100%>   
���̷����� ������ �ȷ�Ʈ�� ���� �ϳ����� �ǹ����� �־ �Ʒ�ó�� �м� ����   
�׷��� ���� �ȷ�Ʈ�� ~!@#!@#^%!@#!@ �Դϴ�   
[* �м���Ʈ ����?](url)   

   
### Main Purchase Clustering Color
	[ ���μ��� �̹��� ]   
����ڰ� �г������� ��ȸ�� ��� �����ͺ��̽����� ���Ż�ǰ�� �ǽð����� ��ȸ�Ͽ� ������ ��ǰ���� **���⿡ �����ͺ��̽��� ��ǰ ��ǥ �� �����ѰŸ� �־�� �ϳ�**���� ������ �� ����Ʈ�� �޾ƿɴϴ�.   
   
`Gray tone Filter`�� �̿��Ͽ� ����ڰ� ������ ��ǰ �߿��� ��鿡 ������ ��ǰ�� ���ܽ�Ų �� `Color Generator`�� Ŭ�����͸��� ������ ������ ���� ���Ż�ǰ ������ �Ը� Ȯ���մϴ�.   
   
�� ��������� `Color Clustering`���� ���� �ַ� ������ ��ǰ�� ���� ����ȭ�Ͽ� �ֿ� ���� ���� �ȷ�Ʈ�� �����մϴ�.

<table border="0" width="100%">
<tr>
<td width="40%">����ڰ� �г������� ��ȸ�� ��� �����ͺ��̽����� ���Ż�ǰ�� �ǽð����� ��ȸ�Ͽ� ������ ��ǰ���� **���⿡ �����ͺ��̽��� ��ǰ ��ǥ �� �����ѰŸ� �־�� �ϳ�**���� ������ �� ����Ʈ�� �޾ƿɴϴ�.</br>`Gray tone Filter`�� �̿��Ͽ� ����ڰ� ������ ��ǰ �߿��� ��鿡 ������ ��ǰ�� ���ܽ�Ų �� `Color Generator`�� Ŭ�����͸��� ������ ������ ���� ���Ż�ǰ ������ �Ը� Ȯ���մϴ�.</br>�� ��������� `Color Clustering`���� ���� �ַ� ������ ��ǰ�� ���� ����ȭ�Ͽ� �ֿ� ���� ���� �ȷ�Ʈ�� �����մϴ�.</td>
<td width="60%"><img src="jay/img/color-clustering.png"></td>
</tr>
</table>
   
## [ Webstie ]
    [ �� ���� �̹��� ]   
### Type Prediction & Matched Palette
`Personal Color Type Prediction`�� ���� ���� ����ڰ� ���ε��� ������ ������ ��`cai.h5`�� �����Ͽ� �۽����÷� Ÿ���� ������ ����ڿ��� �ȳ��մϴ�.   
   
`Recommendation Bright&Harmony Color`�� ������ �۽����÷� Ÿ�� ����� `Skin Color Extraction`�� ������ ������� �󱼻��� �´� Bright Color Palette�� Harmony Color Palette�� ��õ�մϴ�.   

### Fashion Recommendation
`Palette Color Matched Product`���� ���������� ����� 3���� Color Palette�� �ش��ϴ� ��ǰ�� �����ͺ��̽����� �ǽð����� ��ȸ, ��õ�Ͽ� ����ں� ����ȭ ���񽺸� �����մϴ�.