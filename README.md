# CAI(Color Artificial Intelligence)

## About CAI Project
`CAI`�� ����ڰ� ���ε��� ������ ������ ���� �����Ͽ� �۽����÷� Ÿ���� �����ϰ�, �̸� ������� �۽����÷� �ȷ�Ʈ�� �м� �������� ��õ�մϴ�.   
������ ����� ���� ���� �ǴܵǾ��� �ְ����� �۽��� �÷� Ÿ���� ���� ������ ����ڿ��� �������� ������ ȭ��Ʈ �뷱�� ���� �� ��ó���� ���� ���� ���� ����� ������� �۽��� �÷� Ÿ���� �����մϴ�.   
   
`Personal Color`�� ���� ������ ��ü���� �ǹ��ϸ�, ������ Ư���� �м��Ͽ� �۽����÷� Ÿ�� �з�ü���� �� Ÿ�Կ� ������ �������� �׿� ��ȭ�� �̷�� ���� �����Ͽ� ������ ����ũ��, ���, �ǻ� ���� `��ä �̹����� ����`�ϴ� �ý����Դϴ�.   
   
   
## Deap Learning_Personal Color Type Classifier

###   Dataset Creater
`Face Detection` : ���ν�, �̹��� ������¡ (input image ���� 20���� / output image ���� 15����)   
<img src="jay/img/face-detection.jpg" width=700>   
`Skin Color Extraction` : �ȸ� ����   
    [* ���� ���� ����](url)   
<img src="jay/img/skin-color-extraction.jpg" width=700>   
`Color System Converter` : ���� ��� ���� Ÿ�� �з�   
	- BGR �� RGB �� HSV   
`Personal Color Type Classifier` : �����׿� �����ͼ� ����   
    [* �� �м� ����](url)   
<img src="jay/img/color-system-converter.jpg" width=700>   
   
###   Model
	[ ���μ��� �̹��� ]   
`CNN Training`   
Result Model : `cai.h5`   
   
   
## Color Palette Extraction

###   Bright Color & Harmony Color
    [ �м� Ȯ�� ���� �̹����� ������ �� ������ �߰� ]   
���̷����� ������ �ȷ�Ʈ�� ���� �ϳ����� �ǹ����� �־ �Ʒ�ó�� �м� ����   
�׷��� ���� �ȷ�Ʈ�� ~!@#!@#^%!@#!@ �Դϴ�   
[* �м���Ʈ ����?](url)   

   
###   Main Purchase Clustering Color
	[ ���μ��� �̹��� ]   
����ڰ� �г������� ��ȸ�� ��� �����ͺ��̽����� ���Ż�ǰ�� �ǽð����� ��ȸ�Ͽ� ������ ��ǰ���� **���⿡ �����ͺ��̽��� ��ǰ ��ǥ �� �����ѰŸ� �־�� �ϳ�**���� ������ �� ����Ʈ�� �޾ƿɴϴ�.   
   
`Grey tone Filter`�� �̿��Ͽ� ����ڰ� ������ ��ǰ �߿��� ��鿡 ������ ��ǰ�� ���ܽ�Ų �� `Color Generator`�� Ŭ�����͸��� ������ ������ ���� ���Ż�ǰ ������ �Ը� Ȯ���մϴ�.   
   
�� ��������� `Color Clustering`���� ���� �ַ� ������ ��ǰ�� ���� ����ȭ�Ͽ� �ֿ� ���� ���� �ȷ�Ʈ�� �����մϴ�.
   
   
## Web_Personal Color Type Classifier & Fashion Recommendation
    [ �� ���� �̹��� ]   
`Personal Color Type Prediction`�� ���� ���� ����ڰ� ���ε��� ������ ������ ��`cai.h5`�� �����Ͽ� �۽����÷� Ÿ���� ������ ����ڿ��� �ȳ��մϴ�.   
   
`Recommendation Bright&Harmony Color`�� ������ �۽����÷� Ÿ�� ����� `Skin Color Extraction`�� ������ ������� �󱼻��� �´� Bright Color Palette�� Harmony Color Palette�� ��õ�մϴ�.   
   
`Palette Color Matched Product`���� ���������� ����� 3���� Color Palette�� �ش��ϴ� ��ǰ�� �����ͺ��̽����� �ǽð����� ��ȸ, ��õ�Ͽ� ����ں� ����ȭ ���񽺸� �����մϴ�.