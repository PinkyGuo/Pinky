#日期：2017/03/28
#作者：Pinky
#内容：
      开始学习版本管理git啦！！！
	  git init 创建并初始化版本库
	  git add file 把文件放到暂存区
	  git commit --m “xxx”   把文件提交到库版本
	  git diff HEAD -- file  查看库版本中最新的与工作区中的区别
	  git log  查看库版本中版本信息
	  git reset --hard HEAD^  把库版本回退到上一个版本
	  git reflog 查看使用过的命令
	  git checkout --file 把暂存区或者库版本最新的下载到工作区，删除修改