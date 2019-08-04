alter table ZXC_IPRCOMP alter column IPR_LIST_ID rename to IPR_LIST_ID__U23826 ^
drop index IDX_ZXC_IPRCOMP_ON_IPR_LIST ;
alter table ZXC_IPRCOMP drop constraint FK_ZXC_IPRCOMP_ON_IPR_LIST ;
