
$(function(){
	 $.getJSON("department_quertByAll.action",function(result){
			var data = eval('(' + result + ')')
			$('#table').bootstrapTable('load', data);
			
		  });
	 
  		  $('#addBtn').click(function(){
    			var department = $("#editForm").serialize();
    				$.ajax({
    					url:"department_save.action",
    					type:"post",
    					data:department,
    					async: false,
    					success:function(d){
    						alert("添加成功");
    					},
    				error:function(XMLHttpRequest, textStatus, errorThrown){	
    					 if(XMLHttpRequest==500){
    						 alert("部门编号不能为重复！")
    					 }
    						}	
    				})
    			});
  			
  			$("#updateBtn").click(function(){
  				var department = $("#editForm4").serialize();
  				$.ajax({
  					url:"department_update.action",
  					type:"post",
  					async: false,
  					data:department,
  					success:function(d){
  						alert("修改成功");	
  					},
  				error:function(data){	
  						alert("修改失败，请输入正确信息")	
  						}
  				})
  			});
  			$("#queryBtn").click(function(){
  				var department = $("#mform").serialize();
  				$.ajax({
  					url:"department_quert.action",
  					type:"post",
  					data:department,
  					dataType:"text",
  					success:function(data){	
  						var data = eval('(' + result + ')')
  						$('#table').bootstrapTable('load', data);
  				
  				}
  			});	
  			})
  			$("#btnQueryByAll").click(function(){
  				
  					    
  			})
  		
  			$("#deleteBtn").click(function(){
  				var department = $("#editForm3").serialize();
  				$.ajax({
  					url:"department_delete.action",
  					type:"post",
  					data:department,
  					async: false,
  					success:function(d){	
  						alert("删除成功")
  					},
  				error:function(data){	
  						alert("删除失败，请输入要删除的部门ID")	
  						}
  				})
  			});	
  		})
  		 function operateFormatter(value, row, index) {
                return [
                    '<a class="alter" href="javascript:void(0)" title="alter">',
                    '<i class="glyphicon glyphicon-wrench"></i>',
                    '</a>  ','&nbsp&nbsp&nbsp&nbsp&nbsp',
                     '<a class="remove" href="javascript:void(0)" title="remove">',
                    '<i class="glyphicon glyphicon-remove"></i>',
                    '</a>  '
                ].join('');
            }
                window.operateEvents = {
                    'click .alter': function (e, value, row, index) {
                         className = $(this).attr('class');
                        $('#dialogBg2').fadeIn(300);
                        $('#dialog2').removeAttr('class').addClass('animated bounceInDown ').fadeIn();
                        $('#id2').val([row.did]).attr("readOnly","readOnly");
                        $('#name2').val([row.dname]);
                        $('#manager2').val([row.manager]);
                    },
                    'click .remove': function (e, value, row, index) {
                    	className = $(this).attr('class');
                        $('#dialogBg3').fadeIn(300);
                        $('#dialog3').removeAttr('class').addClass('animated bounceInDown ').fadeIn();
                        $('#id3').val([row.did]).attr("readOnly","readOnly");
                        $('#name3').val([row.dname]).attr("readOnly","readOnly");
                        $('#manager3').val([row.manager]).attr("readOnly","readOnly");
                    }
                };
                var w,h,className;
                function getSrceenWH(){
                    w = $(window).width();
                    h = $(window).height();
                    $('#dialogBg').width(w).height(h);
                }

                window.onresize = function(){  
                    getSrceenWH();
                }  
                $(window).resize();  

            $(function(){
                getSrceenWH();
                
                $('#add').click(function(){
                    className = $(this).attr('class');
                    $('#dialogBg').fadeIn(300);
                    $('#dialog').removeAttr('class').addClass('animated bounceInDown ').fadeIn();
                });

                
                $('.claseDialogBtn').click(function(){
                    $('#dialogBg').fadeOut(300,function(){
                        $('#dialog').addClass('bounceOutUp').fadeOut();
                    });
                });
                 $('.claseDialogBtn2').click(function(){
                    $('#dialogBg2').fadeOut(300,function(){
                        $('#dialog2').addClass('bounceOutUp').fadeOut();
                    });
                });
                 $('.claseDialogBtn3').click(function(){
                     $('#dialogBg3').fadeOut(300,function(){
                         $('#dialog3').addClass('bounceOutUp').fadeOut();
                     });
                 });
              
            });